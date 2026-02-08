#include <jni.h>

extern "C"
JNIEXPORT jint JNICALL
Java_com_dola_mindtwist_NativeBridge_sum(
        JNIEnv* env,
        jobject,
        jint a,
        jint b) {
    return a + b;
}
