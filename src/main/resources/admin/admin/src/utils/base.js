const base = {
    get() {
        return {
            url : "http://localhost:8080/springboote2a78/",
            name: "springboote2a78",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboote2a78/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "音乐网站"
        } 
    }
}
export default base
