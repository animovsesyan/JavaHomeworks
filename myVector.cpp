#include <iostream>
#include <exception>

class VectorException : public std::exception {
    const char* message;
public:
    VectorException(const char* msg) : message(msg) {}
    const char* what() const noexcept override { return message; }
};

class IndexOutOfRange : public VectorException {
public:
    IndexOutOfRange() : VectorException("Index is out of range") {}
};

class EmptyVector : public VectorException {
public:
    EmptyVector() : VectorException("Vector is empty") {}
};



template <class T>
class Vector {
   
private:
    
    T* arr;
    int size;
    int capacity;
 
public:
    Vector() {
        size = 0;
        capacity = 100;
        arr = new T[capacity];
    } 
    Vector(const Vector& other) {
        size = other.size;
        capacity = other.capacity;
        arr = new T[capacity]; 
        for(int i = 0; i < size; i++) {
            arr[i] = other.arr[i];
        }
    }

    ~Vector() {
        delete[] arr;
    }

    T& operator[] (int index) {
        if(index < 0 || index >= size) {
            throw IndexOutOfRange();
        }
        return arr[index];
    }
    const T& at(int index) const {
        if(index < 0 || index >= size) {
            throw IndexOutOfRange();
        }
        return arr[index];
    }
    const T& front() const {
         if(size == 0) {
            throw EmptyVector();
        }
        return arr[0];
    }
    const T& back() const {
         if(size == 0){
            throw EmptyVector();
         }
        return arr[size-1];
    }
    void push_back(T arg) {
        if(size == capacity) {
            capacity *= 2;
            T* new_arr = new T[capacity];
            for(int i = 0; i < size; i ++) {
                new_arr[i] = arr[i];
            }
            delete[] arr;
            arr = new_arr;
        }
        
        arr[size] = arg;
        size++;
    }

    void pop_back() {
         if(size == 0){
            throw EmptyVector();
         }
        size--;
    }

    int getSize() const {
        return this->size;
    }

    bool empty() {
        if(size == 0) {
            return true;
        }
        return false;
    }

    Vector& operator= (const Vector& other) {
        if(this != &other) {
            T* new_arr = new T[other.capacity];

            for (int i = 0; i < other.size; i++) {
                new_arr[i] = other.arr[i];
            }
            delete [] arr;
            arr = new_arr;
            size = other.size;
            capacity = other.capacity;

            
        }
        return *this;
    }

    bool operator== (const Vector& other) const {
        if(size != other.size) {
            return false;
        }
        for(int i = 0; i < size; i++) {
            if(arr[i] != other.arr[i]) {
                return false;
            }
        }
        return true;
    }

     bool operator!= (const Vector& other) const {
        if(this == &other) {
            return false;
        }
        return true;
    }




};


