# What is the internal data structure used in linked hashset?
* The LinkedHashSet class in Java is part of the Java Collections Framework and is implemented using a combination of a hash table and a linked list. It maintains a linked list of the entries in the order in which they were inserted (insertion order), in addition to using a hash table for efficient element retrieval.
Here's an overview of the internal data structure used in LinkedHashSet:
* Hash Table:
Like HashSet, LinkedHashSet uses a hash table to store its elements. The hash code of each element is used to determine its bucket location in the hash table.
* Linked List:
In addition to the hash table, LinkedHashSet maintains a doubly-linked list of elements to preserve the order in which elements were inserted. This linked list allows for iterating through the elements in the order of insertion.
* Hashing:
When you add an element to a LinkedHashSet using the add method, the hash code of the element is computed to determine the bucket in the hash table. The element is then added to the linked list for that bucket.
* Performance:
The use of a hash table allows for constant-time average complexity for basic operations (add, remove, contains), assuming a good hash function and a well-distributed set of elements.
The linked list allows for efficient iteration through the elements in the order they were inserted.
* Key Characteristics:
Maintains insertion order: Iterating through a LinkedHashSet will return the elements in the order in which they were inserted.
Unique elements: Like HashSet, LinkedHashSet does not allow duplicate elements.
