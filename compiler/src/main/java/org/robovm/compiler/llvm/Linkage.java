/*
 * Copyright (C) 2012 RoboVM
 *
 * TODO: Insert proper license header.
 */
package org.robovm.compiler.llvm;

/**
 *
 * @version $Id$
 */
public enum Linkage {

    _private,
    linker_private,
    linker_private_weak,
    linkonce,
    linkonce_odr,
    external, 
    internal,
    weak;
    
    public String toString() {
        if (this == _private) {
            return "private";
        }
        return super.toString();
    }
}