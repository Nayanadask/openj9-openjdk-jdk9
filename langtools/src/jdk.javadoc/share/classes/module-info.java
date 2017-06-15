/*
 * Copyright (c) 2014, 2017, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

/** Defines the implementation of the
 *  {@link javax.tools.ToolProvider#getSystemDocumentationTool system documentation tool}
 *  and its command line equivalent, <em>javadoc</em>.
 *
 *  @see <a href="{@docRoot}/../specs/doc-comment-spec.html">
 *      Documentation Comment Specification for the Standard Doclet</a>
 *
 *  @moduleGraph
 *  @since 9
 */
module jdk.javadoc {
    requires transitive java.compiler;
    requires transitive jdk.compiler;
    requires java.xml;

    exports com.sun.javadoc;
    exports com.sun.tools.doclets;
    exports com.sun.tools.doclets.standard;
    exports com.sun.tools.javadoc;

    exports jdk.javadoc.doclet;

    provides java.util.spi.ToolProvider
        with jdk.javadoc.internal.tool.JavadocToolProvider;

    provides javax.tools.DocumentationTool
        with jdk.javadoc.internal.api.JavadocTool;

    provides javax.tools.Tool
        with jdk.javadoc.internal.api.JavadocTool;
}
