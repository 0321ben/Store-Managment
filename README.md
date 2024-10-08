# Store-Managment
Benjamin's project for Store Managment in AP Comp Sci A CTE A 

# Unit 2 - Store Management Project

## Introduction

You are opening a new business in your community! Businesses often need programs to manage the products and services they offer and track orders and requests from customers. Your goal is to create a store management system for your business.

## Requirements

Use your knowledge of object-oriented programming and class structure and design to create your store management system:
- **Create a class hierarchy** – Develop a superclass that represents a product or service your business offers and one or more subclasses that extend the superclass to represent more specific types of products or services.
- **Declare instance variables** – Declare instance variables in the superclass that are shared with the subclasses and instance variables in the subclasses that are not shared with the superclass.
- **Write constructors** – Write no-argument and parameterized constructors in the superclass and subclasses. Subclass constructors use the super keyword to call the superclass constructor.
- **Implement accessor and mutator methods** – Write accessor and mutator methods for instance variables that should be accessible and/or modifiable from outside of the class.
- **Implement a toString() method** – Write toString() methods in the superclass and subclasses that return information about the state of an object.

## UML Diagram

<img src="blob:chrome-untrusted://media-app/26dd9327-8fb8-4d00-a09e-c0de610dd8a8" alt="Copy of UML Diagram.png"/>![image](https://github.com/user-attachments/assets/05b21d6a-3810-4983-856a-308296b48005)


## Description

In my Store Management Project, I chose to make a Donut Shop. I chose to make a Donut Shop because it seemed like a fun idea to make. In the system, I represented each donut as an object in Java. The base donut is a superclass, and I used subclasses to represent different toppings and drink options. For example, I created subclasses for frosting, filling, and sprinkles, as well as coffee options that includes decaf, creamers, sugar, and half-and-half. This setup allowed me to practice using inheritance, with each topping subclass inheriting attributes and methods from the donut superclass. The system uses getters and setters (constructors methods, accessor methods, mutator methods) to manage the details of each item. I also used the toString() method to display the final order details in a readable format in the console. I did have user input, mostly the user will be given yes or no questions and a few specific answers like the type of donut or frosting flavor, and number answers for creamers, sugars, and half-and-half. So mostly the program expects a few specific answers but mainly yes/no answers. Once the user makes it's choices, the program gives out the complete order details to the console, giving a final summary of the donut and drink items selected by the user.
