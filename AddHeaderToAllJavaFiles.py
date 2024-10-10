import os

def add_header_to_java_files(root_dir, header_text):
    # Recursively walk through all files in the directory tree
    for subdir, _, files in os.walk(root_dir):
        for file in files:
            # Process only .java files
            if file.endswith('.java'):
                file_path = os.path.join(subdir, file)
                
                # Read the existing contents of the file
                with open(file_path, 'r', encoding='utf-8') as f:
                    contents = f.read()

                # Add the header only if it’s not already present
                if header_text not in contents:
                    # Write the new header followed by the original contents
                    with open(file_path, 'w', encoding='utf-8') as f:
                        f.write(header_text + '\n' + contents)
                    print(f"Header added to {file_path}")
                else:
                    print(f"Header already present in {file_path}")

# Define the header text you want to add
header_text = """/**
 * MIT License
 *
 * Copyright (c) 2024 Scott Davis
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
 """

# Specify the directory to start the search
root_directory = "/Projects/CSCI-13"

# Run the script
add_header_to_java_files(root_directory, header_text)
