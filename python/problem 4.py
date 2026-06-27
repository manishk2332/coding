import os

# Set the path to the directory you want to list
directory_path = '/new folder'  # Current directory

# List and print the contents
print(f"Contents of directory '{directory_path}':")
for item in os.listdir(directory_path):
    print(item)
