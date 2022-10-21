# ChristmasGiftList

ChristmasGiftList is a Kotlin based program that generate a Christmas Secret Santa list based on the previous year list, the family of each participant and if they can offer to more than one person.

## Installation

Clone the project and open it with [IntelliJ](https://www.jetbrains.com/idea/download/)

Use the SDK corretto-17.0.4.1.


## Usage
In the file :
```kotlin
ParticipantLocalSource
```
add in the fonction a year and the participant like in the previous year
```kotlin
fun getParticipant(year: Int): List<Participant>?
```
then launch the program by pressing the play button in the main fonction in the main file and read the json file in the `ressource/json` folder

Please make sure to update tests as appropriate.
