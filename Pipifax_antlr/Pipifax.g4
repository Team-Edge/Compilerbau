/**
 * Define a grammar called Hello
 */
grammar Pipifax;


startRule		: program EOF;


//////////////	L E X E R	rules	//////////////

KW_VAR			: 'var' ;
KW_INT			: 'int' ;
KW_DOUBLE		: 'double' ;
KW_STRING		: 'string' ;
KW_FUNC			: 'func' ;
KW_IF 			: 'if' ;
KW_ELSE			: 'else' ;
KW_WHILE		: 'while' ;

COMMA			: ',' ;
ASSIGNER		: '=' ;

BR_OP_1			: '(' ;
BR_CL_1			: ')' ;
BR_OP_2			: '[' ;
BR_CL_2			: ']' ;
BR_OP_3			: '{' ;
BR_CL_3			: '}' ;

OP_PLUS			: '+' ;
OP_MINUS		: '-' ;
OP_MULT			: '*' ;
OP_DIV			: '/' ;
OP_AND			: '&&' ;
OP_OR			: '||' ;
OP_NOT			: '!' ;

CMP_SMALLER		: '<' ;
CMP_GREATER		: '>' ;
CMP_EQUAL		: '==' ;
CMP_UNEQUAL		: '!=' ;
CMP_EQSMALLER	: '<=' ;
CMP_EQGREATER	: '>=' ;
CMP_COMPARE		: '<=>' ;

fragment FR_DIGIT		: [0-9] ;
fragment FR_NNDIGIT		: [1-9] ;
fragment FR_NOLEADINGNULLS	: ( FR_DIGIT | (FR_NNDIGIT FR_DIGIT*) ) ;
fragment FR_DOT			: '.' ;
fragment FR_EXPDIGIT	: 'e' | 'E' ;
fragment FR_FLOAT		: FR_NOLEADINGNULLS FR_DOT FR_DIGIT* ;
fragment FR_OPTVZ		: (OP_PLUS | OP_MINUS)? ;
NUM_INT			: FR_NOLEADINGNULLS ;
NUM_FLOAT		: FR_FLOAT ;
NUM_E_FLOAT		: FR_FLOAT FR_EXPDIGIT FR_OPTVZ FR_NNDIGIT FR_DIGIT*;

STRING			: '"' .*? '"' ;
ID				: [a-zA-Z_] [a-zA-Z_0-9]* ;

COMMENT 		: '#'  ~('\r' | '\n')* -> skip ;
WS 				: [ \t\r\n]+ -> skip ;





//////////////	P A R S E R		rules	//////////////


program			: (function | declaration)*;

function		: KW_FUNC ID optParamList codeBlock ;

optParamList	: BR_OP_1 paramList? BR_CL_1;

paramList		: paramDecl (COMMA paramDecl)*;

paramDecl		: ID OP_MULT? dataType;

codeBlock		: BR_OP_3 statement* BR_CL_3;

statement		: ifInstruction | whileLoop | declaration | assignment | funcCall ;

ifInstruction	: KW_IF expression codeBlock (KW_ELSE codeBlock)? ;

whileLoop 		: KW_WHILE expression codeBlock ;

declaration		: KW_VAR ID dataType ;

dataType		: arrayIndex* (KW_INT | KW_DOUBLE | KW_STRING) ;

arrayIndex		: BR_OP_2 expression BR_CL_2;

assignment		: varAccess ASSIGNER expression;

varAccess		: ID arrayIndex*;

expression		: orExpression;

orExpression 	: andExpression (OP_OR andExpression)*;

andExpression 	: invExpression (OP_AND invExpression)*;

invExpression	: OP_NOT? comparisonExpression;

comparisonExpression	: sumExpression ( (CMP_SMALLER sumExpression) | (CMP_GREATER sumExpression) | (CMP_EQSMALLER sumExpression)
						| (CMP_EQGREATER sumExpression) | (CMP_EQUAL sumExpression) | (CMP_UNEQUAL sumExpression) 
						| (CMP_COMPARE sumExpression)  )* ;

sumExpression	: multExpression ( (OP_PLUS multExpression) | (OP_MINUS multExpression) )*;

multExpression	: bracExpression ( (OP_MULT bracExpression) | (OP_DIV bracExpression) )* ;

bracExpression	: innerExpression | (BR_OP_1 expression BR_CL_1) ;

innerExpression : literal | funcCall | varAccess ;

funcCall		: ID optArgList;

optArgList		: BR_OP_1 argList? BR_CL_1;

argList			: argument (COMMA argument)*;

argument		: expression;

literal			: cast? ( OP_MINUS? NUM_INT | OP_MINUS? NUM_FLOAT | OP_MINUS? NUM_E_FLOAT | STRING);

cast			: BR_OP_1 (KW_INT | KW_DOUBLE | KW_STRING) BR_CL_1 ;


