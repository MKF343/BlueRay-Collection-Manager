BlueRay Collection Manager

Description

This is a command-line Java application that allows a user to manage a collection of Blu-ray Discs. You can add new discs, see the contents of your collection, and search for specific titles. The program uses a linked list data structure to store the Blu-ray Discs.

How It Works

The program presents a menu with the following options:

    Add BlueRay to collection: Prompts you to enter the title, director, year of release, and cost of a new Blu-ray Disc.

    See collection: Displays all the Blu-ray Discs currently in your collection.

    Search collection: Prompts for a title and displays the information for that Blu-ray if it exists in the collection.

    Remove BlueRay from collection: Prompts for a title and removes the corresponding Blu-ray from the collection.

    Quit: Exits the program.

The program will continue to loop through the menu until you choose the "Quit" option.

Class and Interface Overview

    Lab11.java: This is the main class that contains the user interface and the main loop of the program. It handles user input and calls the appropriate methods in the BlueRayCollection class.

    BlueRayCollection.java: This class manages the collection of Blu-ray Discs using a linked list (LinkedList). It provides methods to add, remove, search for, and display the discs in the collection.

    BlueRayDisk.java: This class represents a single Blu-ray Disc. It stores the title, director, yearOfRelease, and cost for each disc.

    inter.java: This class contains the logic for presenting the menu to the user and getting their input. It is used by the Lab11 class to interact with the user.
