class Outer:
    def display(self):
        print("Outer class display function")
        
    class Inner:
        def display(self):
            print("Inner class display function")

if __name__ == "__main__":
    outer_obj = Outer()
    inner_obj = outer_obj.Inner()
    
    outer_obj.display()  # Calling outer class display function
    inner_obj.display()  # Calling inner class display function
