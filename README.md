<br />
<p align="center">
  <h1 align="center">Marvel-vs-DC Simulation</h1>

  <p align="center">
    The program simulates a battle between Marvel heroes and villains and DC heroes and villains
  </p>
</p>

## Table of Contents

* [About the Project](#about-the-project)
* [Getting Started](#getting-started)
  * [Prerequisites](#prerequisites)
  * [Installation](#installation)
  * [Running](#running)
* [Evaluation](#evaluation)

## About The Project

The Marvel vs DC project follows standard Object-Oriented Programming (OOP) principles and is designed to manage and categorize characters from the Marvel and DC universes. The program employs a thoughtful class structure, including a Stats class for statistics, a Character class for regular humans, and a SuperHero/Villain class extending the Character class.

Notably, the program integrates a robust database system with distinct classes for storing regular humans and superhumans. The SuperHuman class extends the base Character class, allowing for a comprehensive representation of diverse characters in the Marvel and DC universes.

Key functionalities include the ability to add, delete, search, and display characters, both heroes and villains. Additionally, the program facilitates the addition of powers to characters and features a simulated battle system. The battle simulation leverages character statistics stored in a Stats object, determining the winner based on their respective attributes.

This project seamlessly combines OOP design principles with practical features, offering a versatile tool for managing and exploring characters from iconic comic book universes. The database-driven approach ensures efficient storage and retrieval of character information, providing a comprehensive and interactive experience for users interested in the Marvel and DC realms.

## Getting Started

To get a local copy up and running follow these simple steps.

### Prerequisites

* [Java 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html) or higher

### Installation

1. Download all 4 java files
2. Run the program.
3. (Optional) - run the sample file found on the Github project page

### Running

List of Commands:
- ADDCHARACTER + more info - adds a character along with its details to the data base      
- SEARCHCHARACTER + name - looks for a character with the wanted name and prints his details   
- ADDPOWER + more info - adds a super power to a character
- DISPLAYHEROES - displays all heroes    
- DISPLAYVILLAINS - displays all villains   
- DISPLAYMARVEL - displays all Marvel characters    
- DISPLAYDC - displays all DC characters  
- DISPLAYSTATS - display stats for all characters   
- QUIT - terminates the program (we always need this as the last input)
- FIGHT + 2 names - this input makes the 2 characters fight.      
- - BATTLE RULES:   
--------------------------------A character with superpowers will always win against an NPC    
--------------------------------If both players are NPCs or if both players possess superpowers, we calculate the total attack ability of each   
--------------------------------We add together the five individual statistics within the Stats object of the given character   
--------------------------------To that sum, we now add 10 additional points for each superpower the given character possesses.  

## Evaluation

The current implementation of the character management system stands as a stable and functional framework, adhering to standard OOP design principles. The class hierarchy, incorporating Stats, Character, and SuperHero/Villain classes, works effectively in organizing and representing characters from the Marvel and DC universes. The database integration for regular humans and superhumans further enhances the project's structural integrity.

While rigorous testing has been conducted, it's essential to acknowledge that, like any project, there might be potential bugs that require attention. Future testing iterations will be crucial to ensuring a robust and error-free user experience.

Several features have been successfully implemented, allowing users to add, delete, search, and display characters, along with simulating battles based on character statistics. However, there is room for expansion and enhancement. Incorporating a more user-friendly interface, providing visual representations of characters, or integrating additional attributes to the Stats class could further enrich the user experience.

In terms of improvements, dedicating time to refining the battle simulation algorithm and expanding the database capabilities for more nuanced character information could elevate the project. Implementing a more comprehensive testing suite to cover various scenarios and potential edge cases would contribute to overall stability.

If time allowed for a revisit, I would consider adopting a more modular approach, allowing for easier integration of future features or adaptations. Additionally, incorporating user feedback mechanisms could aid in continuous improvement. Overall, while the current implementation is commendable, ongoing refinement, feature expansion, and attentive bug resolution remain key considerations for further development.


<!--
If you implemented any extras, you can list/mention them here.
-->

___


<!-- Below you can find some sections that you would normally put in a README, but we decided to leave out (either because it is not very relevant, or because it is covered by one of the added sections) -->

<!-- ## Usage -->
<!-- Use this space to show useful examples of how a project can be used. Additional screenshots, code examples and demos work well in this space. You may also link to more resources. -->

<!-- ## Roadmap -->
<!-- Use this space to show your plans for future additions -->

<!-- ## Contributing -->
<!-- You can use this section to indicate how people can contribute to the project -->

<!-- ## License -->
<!-- You can add here whether the project is distributed under any license -->


<!-- ## Contact -->
<!-- If you want to provide some contact details, this is the place to do it -->

<!-- ## Acknowledgements  -->





