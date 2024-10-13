# Use-Case Specification: Applying for a Project

# 1. Applying for a Project

## 1.1 Brief Description
This use case allows hobby developers to apply for a project by filling out an application form. The form should include relevant information to help project owners evaluate candidates. If a developer wants to apply for a project, they need to fill in the following fields:

- Developer Name (Full name)
- Skills (relevant technical skills)
- Availability (start date, hours per week)
- Past Experience (brief description of relevant projects)
- Motivation (reason for applying)
- Contact Information (email or phone)


## 1.2 Mockup 
[(https://www.figma.com/proto/PbcDTfh1rJfSHkRPgnJqgP/IDiscovery?node-id=45-190&t=JjNjER11xKREoCtC-1)](https://www.figma.com/proto/PbcDTfh1rJfSHkRPgnJqgP/IDiscovery?node-id=45-190&t=JjNjER11xKREoCtC-1)

## 1.3 Screenshots
### Submit Action
![Submit Action](../screenshots/uc5_validation.jpg)

### Input Missing
![Input Missing](../screenshots/uc5_input_missing.png)

### Form Validation Error
![Form Validation Error](../screenshots/uc5_error.jpg)

# 2. Flow of Events

## 2.1 Basic Flow
- The developer clicks on the "Apply for Project" button.
- The "Application Form" template pops up.
- The developer fills in the template.
- The developer clicks on the "Submit" button.
- The application is sent to the project owner.

### Activity Diagram
![Activity Diagram](../activity_diagrams/UC5_activity_diagram_applying_for_a_project.png)

##### User Story: City Guide Functionality

**As a** tourist in Stuttgart  
**I want** to search for nearby attractions and restaurants  
**In order to** find suitable places to visit based on my preferences  

## Background:
   **Given** I have accessed the City Guide section of the app  

## Scenario: Display Nearby Attractions
   **Given** the app has detected my current location  
   **When** I view the City Guide  
   **Then** I see a list of nearby places in Stuttgart  

## Scenario: Scroll to Explore More Places
   **Given** I am viewing the list of nearby attractions  
   **When** I scroll down the list  
   **Then** I can view additional places and attractions  

## Scenario: View Restaurant Options
   **Given** I am on the City Guide page  
   **When** I select the "Restaurants" tab  
   **Then** I see a list of recommended restaurants near me  

## Scenario: Leave a Comment
   **Given** I have found an attraction or restaurant of interest  
   **When** I click on the option to leave a comment  
   **And** I enter my comment in the provided field  
   **And** I press the "Submit" button  
   **Then** my comment is added to the location's page  
   **And** I receive a confirmation message  

## 2.2 Alternative Flows
- The developer cancels the application before submitting.
- The developer submits incomplete or incorrect data.

# 3. Special Requirements
- Form validation for mandatory fields (e.g., name, contact information).
- Data privacy considerations (sensitive info like contact details).

# 4. Preconditions
- The developer is logged in to the platform.
- The developer has clicked on the "Apply for Project" button.

# 5. Postconditions
- The application is sent to the project owner.
- The project owner receives a notification of a new application.


# 6. Function Points
n/a

# 7. CRUD Operation
This Use Case represents the "Create" operation in the CRUD (Create, Read, Update, Delete) model, as it involves the creation of an application by the developer.
