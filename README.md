# PriceCentric - Solution Selling and Sales Analytics Application

## Overview

PriceCentric is a Java-based price ranging application designed to facilitate the creation and management of market solutions by combining products from various manufacturers. The application connects customers with marketing agents and allows administrators to monitor sales performance against target prices. It also generates comprehensive Sales Analytics Reports to provide strategic insights.

The primary objective of this project is to implement and populate complex commerce and trade models for solution selling. It enables companies to bundle products into tailored solutions, customized to meet the specific needs of customers within different market segments and through various sales channels. The application also integrates range pricing techniques (floor, target, ceiling) to optimize solution pricing.

## Key Features

- **Solution Selling**: Bundle products into customized solutions for customers.
- **Price Ranging**: Use floor, target, and ceiling pricing strategies for optimal pricing.
- **Sales Analytics**: Generate insights from sales data, identifying best-performing solutions, customers, and salespeople.
- **Market and Channel Management**: Define and manage business markets and channels, tailoring solutions to these segments.
- **Solution Catalog Management**: Manage a catalog of solutions and assign prices for different market/channel combinations.
- **Order Management**: Allow customers to order solutions based on their market profiles.
- **Reports**: Generate and display comprehensive sales analytics, including top solutions, customers, salespeople, and marginal revenues.

## Use Cases

### Configuration

1. **Define Business**: Set up the business context for solution selling.
2. **Define Markets**: Specify the different markets for which solutions will be offered.
3. **Define Channels**: Set up valid channels for each market.
4. **Define Market-Channel Combinations**: Establish combinations of market and channel.

### Marketing

1. **Solution Catalog Management**: Maintain the solution catalog.
2. **Define Solution Bundles**: Create solution bundles for different market-channel combinations.
3. **Select Products**: Choose products to include in the solution bundles.
4. **Assign Prices**: Set prices for each bundle based on market and channel.
5. **Classify Customers**: Classify customers by market and channel.
6. **Order Solutions**: Allow customers to order solutions tailored to their market profile.

### Sales

1. **Sales Login Identification**: Salespeople log in and authenticate.
2. **Customer Intent**: Identify customer intent based on their market and channel.
3. **Display Tailored Solutions**: Display solutions customized for the customer’s market-channel combination.
4. **Create New Orders**: Salespeople initiate new solution orders for customers.

### Sales Analytics Report

The application generates a Sales Analytics Report, which answers the following questions:

1. **Top 3 Best Negotiated Solutions**: Solutions that sell above the target price, broken down by market segments.
2. **Top 3 Best Customers**: Customers who consistently buy at or above the target price.
3. **Top 3 Best Salespeople**: Salespeople who consistently sell above the target price.
4. **Total Marginal Revenue**: Broken down by market, showing how the actual sales compare to the target sales (actual minus target).
5. **Pricing Optimization**: Recommendations on how to adjust the pricing ranges to perform better, based on sales performance.

## System Requirements

- **Java**: JDK 8 or higher
- **Database**: MySQL or any relational database for storing business, market, solution, and sales data
- **Development Tools**: Maven for dependency management, IntelliJ IDEA or Eclipse as IDE
- **Operating System**: Cross-platform (Windows, macOS, Linux)

## Installation Instructions

1. Clone the repository:
    ```bash
    git clone https://github.com/yourusername/pricecentric.git
    ```

2. Navigate to the project directory:
    ```bash
    cd pricecentric
    ```

3. Build the project using Maven:
    ```bash
    mvn clean install
    ```

4. Set up the database schema (MySQL or any compatible relational database).
    - Ensure you have the required tables for storing business, market, solution, and sales data.

5. Run the application:
    ```bash
    mvn exec:java
    ```

6. The application will prompt for login credentials for salespeople and customers. It will also display the solutions tailored to their profiles.

## Usage

### Admin Functions

- **Business Configuration**: Admins can define the business model, market types, and channels.
- **Solution Catalog Management**: Admins can manage the solution catalog, select products, and assign prices.
- **Sales Performance Monitoring**: Admins can review the sales performance, track revenues, and generate sales analytics reports.

### Sales Functions

- **Sales Login**: Salespeople log into the system using their credentials.
- **Customer Profiling**: Salespeople identify the customer’s market and channel.
- **Order Creation**: Salespeople create and process orders for customers based on their profiles.

### Marketing Functions

- **Solution Bundling**: Marketers can define bundles of products tailored to specific markets and channels.
- **Price Assignment**: Marketers can assign prices to each bundle based on the market-channel combination.

## Sales Analytics Report

The system generates the following reports:

1. **Best Negotiated Solutions**: Lists top 3 solutions that are sold above the target price by market segment.
2. **Best Customers**: Lists top 3 customers who buy at or above the target price.
3. **Best Salespeople**: Lists top 3 salespeople who sell more than the target price.
4. **Marginal Revenue Breakdown**: Shows the total marginal revenue, with data on sales above or below the target by market.
5. **Pricing Optimization**: Recommendations for updating price ranges based on sales data to optimize pricing.



