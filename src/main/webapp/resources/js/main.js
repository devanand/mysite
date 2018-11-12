require.config({
    "baseUrl": "res-ext/",
    paths: {
        "jQuery": 'jquery-3.3.1.min'
    },
    shim: {
        'jQuery': ["jQuery"]
    }
});
requirejs(["resources/js/home"]);


