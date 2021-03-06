package com.implimentz.fragments

import java.io.Serializable

/**
 * Created by ironz
 * Author: ironz
 * 09.01.16, 11:16
 * Email: implimentz@gmail.com
 */
interface StackChangeListener {
    fun <D : Serializable> onStackChanged(fragment: Fragment<D>)
}
