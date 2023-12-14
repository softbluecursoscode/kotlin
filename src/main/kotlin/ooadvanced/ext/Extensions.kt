package ooadvanced.ext

fun String.hide(): String {
    return "".padEnd(length, '*')
}
