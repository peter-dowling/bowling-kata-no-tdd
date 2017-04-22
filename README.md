# bowling-kata-no-tdd

Part one of an experiment to develop better TDD practice.

This is my first run through of the bowling kata on http://www.cyber-dojo.org, used a typical rushed brute force approach. History can be seen here http://www.cyber-dojo.org/kata/edit/07EBD6C386?avatar=skunk (not sure how long it's retained). Used testing to validate my work after my first cut at complete code and just hacked through problems as they came up.

Plan is to have a sibling repo created using a TDD approach, curious to see how it compares in implemenetation. Think I'll probably code that in cyber-dojo's interface too, to control for the lack of IDE influencing the finished product.

I wrote this while watching Netflix at midnight and there maybe (probably) was beer involved. So be kind...

Observations from this pass
 * I was very hesitant to refactor once I actually got to testing, definitely had a weak overall view of where work was being done and I just wanted it to work
 * I came up with some pretty bad ideas that I thought would make nice shortcuts but added complexity: stiching the frames into a single string and hopping around in the array by skipping ahead in the loop
 * I rely on an IDE more than I thought, once I got to the testing pass I really missed having a debugger
 * More objects would have been better, think frames as a container for rolls that are built when the initial string is parsed - not sure if I should allow myself to use that learning on my second pass
 
