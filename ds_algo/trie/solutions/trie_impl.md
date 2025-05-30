```java
class Node {
  boolean isLeaf
  Map<Character, Node> children;
}

class Trie {
  Node root;

  void insert(String word) {
    Node current = root;
    
    for (char character: word.toCharArray()) {
      node.children.putIfAbsent(characters[c], new Trie());
      current = node.children.get(characters[c]);
    }

    current.isLeaf = true;
  }

  boolean search(String word) {
    Node current = root;
    
    for (char character: word.toCharArray()) {
      current = node.children.get(characters[c]);
      if (current == null)
        return false;
    }
    
    return current.isLeaf;
  }

  void delete(String word) {
    Stack<Node> stack = new Stack<>();
    
    Node current = root;
    stack.push(current);

    for (char c: word.toCharArray()) {
      Node node = current.peek();
      
      if(node.children.get(c) == null)
        return false;

      stack.push(node.children.get(c)); 
    }

    Node node = stack.pop();

    boolean shouldDelete = false;
    if (!node.isLeaf) {
      shouldDelete = false;
    } else {
      node.isLeaf = false;
      shouldDelete = node.children.isEmpty();
    }

    int i = stack.size() - 1;
    while(!stack.isEmpty() && shouldDelete) {
      node = stack.pop();
      char ch = word.chatAt(i);
      shouldDelete = !node.isLeaf;
      if (shouldDelete) {
        node.children.remove(ch);
        shouldDelete = node.children.isEmpty();
      }
    }
  }
}
```