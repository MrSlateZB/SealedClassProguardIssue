package com.example.myapplication

sealed class ClassToKeep

class A {
    data object B : ClassToKeep()
}

data object C : ClassToKeep()
