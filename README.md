## Pg. 55 Q&A

The problem I ran into when creating the Cash class was that since I made Asset abstract, I needed to replace the 
getValue() method in Cash before it could be functional. The options I could do were make
Cash an abstract class, remove abstract from Asset, or implement the getValue() method to Cash which is what I did.
I picked this one since it kept the Asset class unavailable from the user like it should, while allowing the Cash class to
inherit its variables and use its own getValue() method.