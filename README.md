# Qantas Flight Web Automation

This project automates the flight search functionality on the [Qantas website](https://www.qantas.com/au/en.html) using Selenium WebDriver (Java) and Maven.

## Table of Contents
- [Prerequisites](#prerequisites)
- [Setup Instructions](#setup-instructions)
- [Running the Automation Script](#running-the-automation-script)
- [Expected Behavior](#expected-behavior)
- [Troubleshooting](#troubleshooting)
- [Contact](#contact)

## Prerequisites

Before running the automation script, please ensure you have the following installed:

1. **Java Development Kit (JDK 11 or later)**
   - Download from: [Adoptium](https://adoptium.net/)
   - Verify installation by running:
     ```bash
     java -version
     ```

2. **Apache Maven**
   - Download from: [Maven Download](https://maven.apache.org/download.cgi)
   - Verify installation by running:
     ```bash
     mvn -version
     ```

3. **Google Chrome**
   - Download from: [Google Chrome](https://www.google.com/chrome/)

4. **ChromeDriver**
   - The project uses WebDriverManager to automatically download the correct ChromeDriver during the build.
   - Ensure you have an active internet connection for Maven to download the necessary dependencies.

5. **Git**
   - Download from: [Git Downloads](https://git-scm.com/downloads)

## Setup Instructions

1. **Clone the Repository**

   Open a terminal or command prompt, navigate to your desired directory, and run:
   ```bash
   git clone https://github.com/AJosephVelasquez/Qantas-Automation.git
   cd Qantas-Automation
   
2. **Build the Project**

In the project directory, execute:
    mvn clean install
This command compiles the project and downloads all required dependencies.

3. **Running the Automation Script**
There are two options to run the script:

  **Option 1: Using Maven from the Command Line**
    - Run the following command:
    - mvn exec:java -Dexec.mainClass="SteelXAutomationChallenge.Automation.FlightWebAutomation"
    - This command will launch Google Chrome and execute the automation script.

  **Option 2: Using an IDE (e.g., Eclipse or IntelliJ IDEA)**
    - Import the project as a Maven project into your IDE.
    - Locate the main class: SteelXAutomationChallenge.Automation.FlightWebAutomation.
    - Right-click on the file and select Run as Java Application.
