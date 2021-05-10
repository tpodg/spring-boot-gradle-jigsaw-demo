module com.example.demo {
    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires spring.context;

    requires com.example.module;
    opens com.example.demo to spring.core, spring.beans, spring.context;
}
