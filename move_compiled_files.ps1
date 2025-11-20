# PowerShell script to compile and move Java class files
# Usage: Run this script in your Java project directory

# Compile all Java files
javac *.java

# Create compiled folder if it doesn't exist
if (!(Test-Path compiled)) {
    New-Item -ItemType Directory -Path compiled
}

# Move all .class files to compiled
Move-Item *.class compiled

Write-Host "Compilation complete. All .class files moved to compiled folder."
