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
 
```
Write a program to score a game of Ten-Pin Bowling.

Input: string (described below) representing a bowling game
Ouput: integer score

The scoring rules:

Each game, or "line" of bowling, includes ten turns, 
or "frames" for the bowler.

In each frame, the bowler gets up to two tries to 
knock down all ten pins.

If the first ball in a frame knocks down all ten pins,
this is called a "strike". The frame is over. The score 
for the frame is ten plus the total of the pins knocked 
down in the next two balls.

If the second ball in a frame knocks down all ten pins, 
this is called a "spare". The frame is over. The score 
for the frame is ten plus the number of pins knocked 
down in the next ball.

If, after both balls, there is still at least one of the
ten pins standing the score for that frame is simply
the total number of pins knocked down in those two balls.

If you get a spare in the last (10th) frame you get one 
more bonus ball. If you get a strike in the last (10th) 
frame you get two more bonus balls.
These bonus throws are taken as part of the same turn. 
If a bonus ball knocks down all the pins, the process 
does not repeat. The bonus balls are only used to 
calculate the score of the final frame.

The game score is the total of all frame scores.

Examples:

X indicates a strike
/ indicates a spare
- indicates a miss
| indicates a frame boundary
The characters after the || indicate bonus balls

X|X|X|X|X|X|X|X|X|X||XX
Ten strikes on the first ball of all ten frames.
Two bonus balls, both strikes.
Score for each frame == 10 + score for next two 
balls == 10 + 10 + 10 == 30
Total score == 10 frames x 30 == 300

9-|9-|9-|9-|9-|9-|9-|9-|9-|9-||
Nine pins hit on the first ball of all ten frames.
Second ball of each frame misses last remaining pin.
No bonus balls.
Score for each frame == 9
Total score == 10 frames x 9 == 90

5/|5/|5/|5/|5/|5/|5/|5/|5/|5/||5
Five pins on the first ball of all ten frames.
Second ball of each frame hits all five remaining
pins, a spare.
One bonus ball, hits five pins.
Score for each frame == 10 + score for next one
ball == 10 + 5 == 15
Total score == 10 frames x 15 == 150

X|7/|9-|X|-8|8/|-6|X|X|X||81
Total score == 167
```