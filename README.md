# CSC2001F 2023 Assignment 5
#### Instructions
The goal of this assignment is to programmatically compare the performance of Dijkstra's shortest paths algorithm (as per the course slides) with the theoretical performance bounds.
#### Dataset Generation and Basic Operation
Write an application to generate data, insert the data into a graph and measure the performance experimentally.  Use the attached code (from the textbook) as a starting point (or write everything from scratch or use standard code from elsewhere).

For a single test, you need to assume values for |V| (number of vertices) and |E| (number of edges), then generate a random dataset (in the same format as Graph1.txt).  Save the dataset to a file on disk (so the experiment can be validated later).  Then, load the data into a graph and run Dijkstra's algorithm to determine shortest paths.

For multiple tests, you will need to repeat these operations for different values of |V| and |E|,   You can assume the first vertex in each dataset is the source; or you can loop over all source vertices and take averages.