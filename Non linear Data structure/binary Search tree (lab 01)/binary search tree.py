class BST:
    def __init__(self, key):
        self.left = None
        self.right = None
        self.key = key

def insert(root, key):
    if root is None:
        return BST(key)
    else:
        if root.key == key:
            return root
        elif root.key < key:
            root.right = insert(root.right, key)
        else:
            root.left = insert(root.left, key)
    return root

def inOrder(root):
    if root:
        inOrder(root.left)
        print(root.key)
        inOrder(root.right)

def preOrder(root):
    if root:
        print(root.key)
        preOrder(root.left)
        preOrder(root.right)

def postOrder(root):
    if root:
        postOrder(root.left)
        postOrder(root.right)
        print(root.key)

root = BST(30)
root = insert(root, 20)
root = insert(root, 10)
root = insert(root, 15)
root = insert(root, 25)
root = insert(root, 23)
root = insert(root, 39)
root = insert(root, 35)
root = insert(root, 42)

print("Start of InOrder Traversal ")
inOrder(root)
print("End of InOrder Traversal \n")

print("Start of PostOrder Traversal")
postOrder(root)
print("End of PostOrder Traversal \n")

print("Start of PreOrder Traversal")
preOrder(root)
print("End of PreOrder Traversal")
