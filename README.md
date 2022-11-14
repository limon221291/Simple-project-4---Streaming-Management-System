Suppose your client want from you to get a streaming management system. By using the system
your client will be able to manage the activities of the system easily.
Create a class named StreamInfo inside of the stream package. StreamInfo class should have
uName, uAccountNo, ubalance and numberOfMovie instance varaiables. Your client wants to
keep ubalance and numberOfMovie private. There should be some methods to get and
set(parameterized) the values of those private variables. StreamInfo does also have a constructor
with four parameters to initialize the instance variables. StreamInfo also have few methods

updateUAccountNo and updateName() (parameterized). There should be also a non-
parameterized watchMovie() method which will reduce the balance by 50 and increase the

numberOfMovie by 1 once it gets called. [5]


Create another class named StreamInfoV2 that inherits/extends the StreamInfo class.
StreamInfoV2 also have the non-parameterized watchMovie () method which will reduce the
balance by 100 and increase the numberOfMovie by 2 once it gets called.
Now crate another class named Main inside of the default/src package. From the main class create
an array of object of the StreamInfoV2 class. The array size and the instance variables’ values of
each object will be user defined. Show the utilization of all of the constructors and methods that
you have written inside of the both parent and child classes. Also print the person’s name who
have seen the minimum numberOfMovie.
