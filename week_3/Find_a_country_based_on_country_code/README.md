# Find a Country Based on Country Code (Java)

This folder contains a Java project for finding the name of a country using its country code. The code in this directory is part of **Week 3** of the Cognizant DN 4.0 Deep Skilling program.

## Folder Structure

```
week_3/Find_a_country_based_on_country_code/
│
├── src/                      # Java source code files
│   └── ...                   # (e.g., FindCountryByCode.java, etc.)
├── data/                     # Data files (if any, e.g., country codes CSV or JSON)
├── README.md                 # This documentation file
└── ...                       # Other resources (e.g., requirements, helper scripts)
```

- **src/**: Contains the main Java classes and source code for the country code lookup functionality.
- **data/**: (If present) May include files listing country codes and their corresponding country names.
- **README.md**: This documentation file.
- **Other Resources**: Any helper scripts, project config files, or documentation relevant to the project.

## Objective

The goal of this project is to provide a simple way to look up the name of a country, given its country code. This is useful for applications that process international data, user registrations, or any context where country codes are used.

## How It Works

1. **Input:** The user provides a country code (e.g., "IN" for India, "US" for United States).
2. **Processing:** The Java program processes the input and searches for the country name that matches the given code.
3. **Output:** The corresponding country name is displayed or returned.

## Usage

1. Clone the repository or download the folder.
2. Navigate to this directory and review the code inside `src/`.
3. Compile and run the main Java file.
4. Enter a country code when prompted to get the country name.

### Example

```sh
$ javac src/FindCountryByCode.java
$ java -cp src FindCountryByCode
Enter country code: IN
Country name: India
```

## Notes

- Make sure you have Java installed (JDK 8 or higher recommended).
- The structure or filenames may vary; please check the actual contents for details.
- If a data file (like `countries.csv` or `countries.json`) is present, it may be required for the program to run.
- For questions or issues, refer to the main repository or contact the project owner.

---
**Cognizant DN 4.0 Deep Skilling – Week 3 (Java)**
