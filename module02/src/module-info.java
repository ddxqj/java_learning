import my.four.MyService;
import my.four.Service01;
import my.four.Service02;

module module02 {
    exports my.one;
    exports my.two;
    exports my.four;

    provides MyService with Service01, Service02;
}