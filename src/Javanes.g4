grammar Javanes;

programa: funcoes ;
funcoes: funcao* ;
funcao: 'func' ID '(' parametros ')' tretorno bloco ;
parametro: ID ':' (TIPOS | BOOL | STRING) ;
parametros: (parametro (',' parametro)*)? ;
bloco: '{' instrucao* '}' ;
tretorno: TIPOS | TIPOR | BOOL | STRING;

corpo: bloco | instrucao ;
instrucao: declaracao | condicional | chamada ';' | atribuicao | cada | enquanto | retorno ;
condicional: SE '(' expr ')' corpo (SENAO corpo)? ;
declaracao: SEJA ID '=' expr ';' ;
retorno: RETORNA expr? ';' ;
chamada: ID '(' args ')';
args: (expr (',' expr)*)? ;
atribuicao: ID ('=' | ATRARIT) expr ';' ;
cada: CADA '(' ID EM expr ')' corpo ;
enquanto: ENQUANTO '(' expr ')' corpo ;

expr:
     NUM | chamada | STRING | BOOL | ID | NOT expr | NEG expr
    | AP expr ')'  | expr EXP expr  | expr MULMODDIV expr | expr OPBIN expr
    | expr ADDSUB expr | expr (OPEQ | OPREL) expr | expr OPAND expr  | expr OPOR expr  | expr OPIMPL expr;

ATR: '=';
OPEQ: '==' | '!=' ;
OPREL: ('>'|'<')'='? ;
OPBIN: '&' | '|' | '^' ;
OPLOG: 'e' | 'ou' | 'nao';
OPAND: '&&' ;
OPOR: '||' ;
OPIMPL: '->' ;
NOT: '!' ;
NEG: '--' ;
AP: '(' ;
FP: ')';

SEJA: 'seja' ;
EM: 'em' ;
SE: 'se' ;
SENAO: 'senao';
ENQUANTO: 'enquanto';
CADA: 'cada' ;
RETORNA: 'retorna' ;

BOOL: 'verdadeiro' | 'falso' ;
STRING: '"' ([^"] | '\\"' | .)*? '"' ;
TIPOS: 'inteiro' | 'decimal';
TIPOR: 'nada';

FUNC: 'func' ;

NUM: '-'? ('0' | [1-9]('_'?[0-9])*)('.'[0-9]('_'?[0-9])*)? ;
ID: [a-zA-Z_][a-zA-Z_0-9]* ;

EXP: '**' ;
ATRARIT: OPARIT '=' ;
MULMODDIV: [*/%] | '//' ;
ADDSUB: [+\-] ;
OPARIT: MULMODDIV | ADDSUB ;

COM: '#' .*? [\n] -> skip ;
WS: [ \r\t\n]+ -> skip ;
ErrorChar: . ; 