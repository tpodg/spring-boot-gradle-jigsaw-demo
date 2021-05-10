module com.example.module {
    requires spring.web;
    requires org.apache.tomcat.embed.core;

    opens com.example.demo.module.controller to spring.beans, spring.web;
}
