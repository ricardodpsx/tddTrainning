
Exercise: 
Create a command line program that works like this:

java googleAndBingResults cerveza 5
  - Cerveza - Wikipedia, la enciclopedia libre
  - Historia de la cerveza - Wikipedia, la enciclopedia libre
  - Elaboración de cerveza - Wikipedia, la enciclopedia libre

So the program should receive the console arguments, http request google and bing, merge the results and show the first n results.

Additionally it should create a LRU cache of size 15 to store the results of the most popular searches, the cache can be saved into a local file and its loaded overtime the application starts. 

Remember that LRU cache means “Last Recently Used”, and its basically a data structure with limited capacity (In this case 15) and when it is full it only keeps the items that have been accessed recently, the other items are deleted somehow.

(optional) The cache should delete entries that haven’t been active for more than 2 days.

Notes:
 The objective with this exercise is to encourage you to use the concepts of TDD and Refactoring:
   Very likely you will be required to use Mocks, Stubs and Integration testing.

Remember that testing is a creative process, you should use your creativity to come up with nice and communicative ways to test things.




 
