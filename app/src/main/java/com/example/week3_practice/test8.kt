package com.example.week3_practice

fun demo(x:Any)
{
    if(x is String)
    {
        print(x.length)
    }

    if(x !is String) return

    print(x.length)
}