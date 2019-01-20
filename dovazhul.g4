grammar dovahzul;

program : statement+;

statement : let | show ;

let : VAR 'LOS' (INT | STR | TRUE | FALSE | equation) ;
show : 'REIN' (INT | VAR | equation) ;

equation : add | minus | mult | div | and | or | less | greater | equal ;

add : (INT | VAR) 'AAV' (INT | VAR) ;
minus : (INT | VAR) 'AUS' (INT | VAR) ;
mult : (INT | VAR) 'DUN' (INT | VAR) ;
div : (INT | VAR) 'DUR' (INT | VAR) ;
and : (TRUE | FALSE | VAR) 'AHRK' (TRUE | FALSE | VAR) ;
or : (TRUE | FALSE | VAR) 'ONT' (TRUE | FALSE | VAR) ;
less : INT 'SAHLO' INT ;
greater : INT 'LOT' INT ;
equal : INT 'RO' INT ;

VAR : [a-z]+ ;
INT : [0-9]+ ;
STR : '"' (~[\\r\n"])* '"' ;
TRUE : 'VAHZAH' ;
FALSE : 'FOLAAS' ;
WS : [ \n\t]+ -> skip;