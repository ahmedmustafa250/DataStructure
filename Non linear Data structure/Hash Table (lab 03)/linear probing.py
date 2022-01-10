import numpy as np

class Hash_table() :
    
    def __init__(self,size) :
        self.size = size
        self.hashtable = np.array([None]*self.size)
        
    def hash(self,key) :
        
        # Hash function h(x) = x%10
        index = key%10 
        
        if self.hashtable[index] == None :
            return index
        else :
            
            # Implementing linear probing
            while self.hashtable[index] != None :
                index = (index+1)%10
                
            return index
        
    def insert(self,key) :
        
        index = self.hash(key)
        self.hashtable[index] = key
        
    def search(self,key) :
        
        index = key%10
        
        if self.hashtable[index] != key :
            while self.hashtable[index] != key and self.hashtable[index] != None :
                index = (index+1)%10
                
        if self.hashtable[index] == key :
            return index
        else :
            return None
    
    def print_hashtable(self) :
        
        print("Hash table is :-\n\nindex \t value")
        for x in range(len(self.hashtable)) :
            print(x,"\t",self.hashtable[x])

# Initializing hash table of size 10
HT = Hash_table(10)

# Inserting only 5 values to make λ <= 0.5
HT.insert(50)
HT.insert(30)
HT.insert(16)
HT.insert(11)
HT.insert(33)

HT.print_hashtable()

index = HT.search(35)

if index!= None :
    print("\nGiven key is present at index",index)
else :
    print("\nGiven key is not present in the hash table")
