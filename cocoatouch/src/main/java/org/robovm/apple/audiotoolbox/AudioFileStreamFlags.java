/*
 * Copyright (C) 2013-2015 RoboVM AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.apple.audiotoolbox;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.opengles.*;
import org.robovm.apple.coreaudio.*;
import org.robovm.apple.coremedia.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Marshaler(Bits.AsMachineSizedIntMarshaler.class)/*</annotations>*/
public final class /*<name>*/AudioFileStreamFlags/*</name>*/ extends Bits</*<name>*/AudioFileStreamFlags/*</name>*/> {
    /*<values>*/
    public static final AudioFileStreamFlags None = new AudioFileStreamFlags(0L);
    public static final AudioFileStreamFlags PropertyFlag_PropertyIsCached = new AudioFileStreamFlags(1L);
    public static final AudioFileStreamFlags PropertyFlag_CacheProperty = new AudioFileStreamFlags(2L);
    public static final AudioFileStreamFlags ParseFlag_Discontinuity = new AudioFileStreamFlags(1L);
    public static final AudioFileStreamFlags SeekFlag_OffsetIsEstimated = new AudioFileStreamFlags(1L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/AudioFileStreamFlags/*</name>*/[] values = _values(/*<name>*/AudioFileStreamFlags/*</name>*/.class);

    public /*<name>*/AudioFileStreamFlags/*</name>*/(long value) { super(value); }
    private /*<name>*/AudioFileStreamFlags/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/AudioFileStreamFlags/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/AudioFileStreamFlags/*</name>*/(value, mask);
    }
    protected /*<name>*/AudioFileStreamFlags/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/AudioFileStreamFlags/*</name>*/[] values() {
        return values.clone();
    }
}
