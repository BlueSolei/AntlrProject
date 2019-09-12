grammar SimpleGrammar;

main: 'Hello ' name '!';
name: ANY+;
ANY: .;