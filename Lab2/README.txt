Commands:

gradle clean

cd C:\Users\Jbonu\git\compilers\Lab2>

C:/data/java/jdk1.7.0_79/bin/java.exe -classpath C:/Users/Jbonu/git/compilers/Documents/sablecc-3.6/lib/sablecc.jar org.sablecc.sablecc.SableCC C:/Users/Jbonu/git/compilers/Lab2/src/CP_Parser.scc


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

ISSUE 5 - 

References:
http://sablecc.sourceforge.net/thesis/thesis.html#PAGE45
https://github.com/SableCC/sablecc.github.io/blob/master/java1.5/java-1.5.sablecc
https://groups.google.com/forum/#!topic/comp.compilers/JUga-QcnmLI



