import os

def read_fourth_line(file_path):
    with open(file_path, 'r') as file:
        lines = file.readlines()
        if len(lines) >= 4:
            return lines[3].strip()  # 4th line, index 3 (0-based)
        else:
            return None
def main():
    cant = 0
    dic = {}
    current_directory = os.getcwd()
    for filename in os.listdir(current_directory):
        if os.path.isfile(filename) and filename.endswith('.java'):
            fourth_line = read_fourth_line(filename)
            if fourth_line is not None:
                cant += 1
                operator = fourth_line[2:fourth_line.index(':')]
                if operator not in dic:
                    dic[operator] = 0
                dic[operator] += 1
            else:
                print(f"'{filename}' does not have a fourth line.")
    print(cant)
    print(dic)

if __name__ == "__main__":
    main()