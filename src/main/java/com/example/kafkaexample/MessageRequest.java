package com.example.kafkaexample;

import java.util.Objects;

public record MessageRequest(String message) {
}

/**
 * Records are special kinds of java class which represents immutable objects
 * and was introduced to reduce boilerplate code.
 * The above record code is equivalent to the below boilerplate code.

package com.example.kafkaexample;

import java.util.Objects;

public final class MessageRequest {
    private final String message;

    public MessageRequest(String message) {
        this.message = message;
    }

    public String message() {
        return message;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (MessageRequest) obj;
        return Objects.equals(this.message, that.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message);
    }

    @Override
    public String toString() {
        return "MessageRequest[" +
                "message=" + message + ']';
    }

}

 **/
