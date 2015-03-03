#Gravity Simulator

Problem Statement
------------------
Your task is to create a gravity simulator in a two-dimensional grid world. In this simulation, gravity pulls particles down towards the bottom of the screen. This world consists of multiple particles all with different properties. Anti-gravity particles are not effected by gravity, they stay where they were originally placed and never move. Normal particles will keep moving down through empty space, one step at a time, until it comes in contact with the bottom of the grid, or any other particle. Given an input of a grid world before it is affected by gravity, output the same world after gravity has run its course.

Input Format
-------------
On standard console input, the first line will contain an integer, N, representing the N x N grid of ASCII characters. This means there will be N-lines of N-characters long.
This is the starting grid of your simulated world: the character ' ' (space) means empty space, while '.' (dot) represents a gravity-affected particle, and '#' (hash or pound) represents anti-gravity particles.

Output Format
--------------
Once you parse the input, simulate the world until all particles are settled (e.g. the particles have fallen and either settled on the bottom of the world or on an anti-gravity particle). Print to standard out the end result of all particle positions using the same format the input uses to depict particles.
