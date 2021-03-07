package com.smeup.test.antlr

import com.smeup.test.antlrtutorial.parser.ArrayInitLexer
import com.smeup.test.antlrtutorial.parser.ArrayInitParser
import org.antlr.v4.runtime.ANTLRInputStream
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.tree.ParseTree

fun main() {
    // create a CharStream that reads from standard input
    val input = ANTLRInputStream(System.`in`)

    // create a lexer that feeds off of input CharStream
    val lexer = ArrayInitLexer(input)

    // create a buffer of tokens pulled from the lexer
    val tokens = CommonTokenStream(lexer)

    // create a parser that feeds off the tokens buffer
    val parser = ArrayInitParser(tokens)
    val tree: ParseTree = parser.init() // begin parsing at init rule
    println(tree.toStringTree(parser)) // print LISP-style tree
}
