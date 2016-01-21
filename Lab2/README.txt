
Status:
-------
The test files in08.cp and in09.cpp are failing due to the issue with block contains the variable declarations.

All other test files executed without error.

in01.cp - PASS
in02.cp - PASS
in03.cp - PASS
in04.cp - PASS
in05.cp - PASS
in06.cp - PASS
in07.cp - PASS
in08.cp - FAILED
in09.cp - FAILED
in10.cp - PASS




Commands:
----------
Set Gradle environment.

gradle clean
gradle exec(windows)


Issues:-
-----------
ISSUE 1 - fixed
Verifying identifiers.
java.lang.RuntimeException: [0,0] Redefinition of AClassDecls.

ISSUE 2 - in01.cp fixed 
Starting Lexer
Starting Parser
[1,1] expecting: '{', 'class'

ISSUE 3 - in03.cp - fixed
expecting: '}'

ISSUE 4 - in08.cp
Starting Lexer
Starting Parser
[59,9] expecting: ']'



References:
http://sablecc.sourceforge.net/thesis/thesis.html#PAGE45
https://github.com/SableCC/sablecc.github.io/blob/master/java1.5/java-1.5.sablecc
https://groups.google.com/forum/#!topic/comp.compilers/JUga-QcnmLI



