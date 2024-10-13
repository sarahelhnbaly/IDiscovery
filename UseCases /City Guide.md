

# Software Requirements Specification (SRS) for City Guide

**Project Title**:Idiscovery App - City Guide Feature  

---

## 1. Introduction

### 1.1 Purpose  
The purpose of this document is to outline the requirements for the City Guide feature of the City Exploration App. This includes functional and non-functional requirements, user interface designs, and system interactions.

### 1.2 Scope  
The City Guide feature will allow users to discover nearby attractions and restaurants based on their current location, view details about these places, leave comments, and interact with the app for an enriched exploration experience.

---

## 2. Overall Description

### 2.1 Product Perspective  
The City Guide is part of a larger application designed for urban exploration, providing users with access to local attractions and dining options.

### 2.2 User Classes and Characteristics  
- **Tourists**: Users seeking to explore the city and find nearby attractions or restaurants.
- **Residents**: Users looking for new places to visit or dining options in their area.

### 2.3 Operating Environment  
The application will be available on both mobile and web platforms, with functionality available through GPS to detect user locations.

---

## 3. Functional Requirements

### 3.1 Location-Based Search
- Users must be able to view nearby attractions and restaurants based on their current GPS location.

### 3.2 Scrollable List
- Users can scroll through the list of nearby venues to find additional recommendations.

### 3.3 Restaurant Options
- Users can switch to a "Restaurants" tab to display dining options.

### 3.4 Commenting Feature
- Users can leave comments or reviews for specific attractions or restaurants.

### 3.5 CRUD Operations
- **Create**: Users can add new comments or reviews for venues.
- **Read**: Users can view details of nearby attractions and restaurants.
- **Update**: Users can edit their comments or reviews if they wish to change their feedback.
- **Delete**: Users can remove their comments or reviews if necessary.

---

## 4. Non-Functional Requirements

### 4.1 Performance Requirements  
- The City Guide must display nearby locations within 3 seconds of accessing the feature.

### 4.2 Usability Requirements  
- The UI must be user-friendly, providing an intuitive experience for both tourists and residents.

### 4.3 Security Requirements  
- Users must be authenticated to perform CRUD operations on comments and reviews to ensure data integrity.

---

## 5. User Interface Requirements

### 5.1 Narrative  
The City Guide feature is designed to engage users by providing a simple and effective interface to explore local attractions and dining options. Upon accessing the City Guide, users are shown a list of nearby places based on their current location. They can easily scroll to view more options and switch tabs to find restaurants. The ability to leave comments encourages user interaction and feedback, enhancing community engagement.

### 5.2 Mockups  
- **Home Page**: The City Guide section includes a search bar, a list of nearby attractions, and tabs for restaurants.
- **City Guide Page**: Features a prominent display of a map and a list of attractions/venues, with options for scrolling.

### 5.3 Activity Diagram  
**User Activities**
- Start 
- Access City Guide 
- View Nearby Attractions 
- Scroll for More Places 
- Switch to Restaurant Tab 
- Select Venue for More Details 
- Leave a Comment (Create)
- Edit a Comment (Update)
- Delete a Comment 
- End

**System Activities**
- Detect Current Location 
- Display Nearby Attractions 
- Show Additional Recommendations 
- Display Restaurant Options 
- Enable Comment Submission (Create)
- Acknowledge Comment Posted (Read Confirmation)
- Enable Comment Editing (Update)
- Acknowledge Comment Updated 
- Enable Comment Deletion (Delete)
- Acknowledge Comment Deleted 

```plaintext
   User Activities                              System Activities
   -------------------------                    ----------------------
          [Start]                                 
             ↓                                               
      [Access City Guide]   <---------------------- [Detect Current Location]
             ↓                                                    
      [View Nearby Attractions] <--------------- [Display Nearby Attractions]
             ↓
        [Scroll for More Places] 
             ↓                                               
      [Switch to Restaurant Tab]  <----- [Display Restaurant Options]
             ↓
       [Select Venue for More Details] 
             ↓
         [Leave a Comment]  --------------------→ [Acknowledge Comment Posted]
             ↓
     [Edit a Comment]  ----------------------→ [Acknowledge Comment Updated]
             ↓
     [Delete a Comment]  --------------------→ [Acknow
#### 6. Wireframe

![a29aN7sKQUJDERduSw1b5h](https://github.com/user-attachments/assets/06a19138-246d-4f1a-9c36-00c10cba46f2)

