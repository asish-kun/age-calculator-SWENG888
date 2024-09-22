# Age Calculator App

The **Age Calculator App** is an Android application that calculates a user's age based on the input of their first name, last name, and date of birth. The app also handles invalid inputs and notifies the user via `Toast` messages.

## Features

- **User Input Fields:**
  - First Name
  - Last Name
  - Date of Birth (MM/dd/yyyy format)
  
- **Calculate Age:**
  - Based on the entered date of birth, the app calculates the user's age.
  
- **Input Validation:**
  - Displays error messages if any fields are left empty or if the date format is invalid.
  
- **User Feedback:**
  - The calculated age is displayed via a `Toast` notification.

## Screenshots
**General User Flow:**
<img width="318" alt="Screenshot 2024-09-22 at 14 45 55" src="https://github.com/user-attachments/assets/21f4c2e1-2cce-4e02-abeb-3a33d3b03dea">

**Empty Fields:**
<img width="332" alt="Screenshot 2024-09-22 at 14 46 33" src="https://github.com/user-attachments/assets/64523131-3ccd-4509-9bb2-1e61122e4c23">

**Incorrect Format:**
<img width="330" alt="Screenshot 2024-09-22 at 14 46 14" src="https://github.com/user-attachments/assets/8ff1bafe-ffad-4781-acf6-6fc478f40d74">


## Installation and Setup

To run this project on your local machine:

1. Clone this repository to your local machine.
    ```bash
    git clone https://github.com/your-username/age-calculator-app.git
    ```
2. Open the project in **Android Studio**.
3. Sync the Gradle files.
4. Run the project on an Android emulator or connected device.

## Technologies Used

- **Kotlin**: The main language used for the development.
- **Android SDK**: Android development framework.
- **Android Studio**: IDE for Android development.

## How It Works

1. User inputs their first name, last name, and date of birth.
2. The app validates that all fields are filled in and that the date format is correct.
3. The app calculates the user's age based on the current date and displays it via a `Toast`.

### Age Calculation Logic

The app calculates the age by:

- Extracting the year from the date of birth and comparing it to the current year.
- Adjusting the age if the current date has not yet passed the user's birthday for the current year.

## Error Handling

- If any field is empty, a `Toast` message prompts the user to fill all fields.
- If the date format is invalid, a `Toast` message displays "Invalid Date Format".

## Contact

If you have any questions or suggestions, feel free to contact the developer:

- **Asish Nelapati**: [akn5618@psu.edu]

