eventCreateWarStart = { warName, stagingDir ->
    Ant.delete(dir: "${stagingDir}/build")
    Ant.delete(dir: "${stagingDir}/node_modules")
    Ant.delete(dir: "${stagingDir}/src")
    Ant.delete(dir: "${stagingDir}/test")
    Ant.delete(file: "${stagingDir}/aurelia.protractor.js")
    Ant.delete(file: "${stagingDir}/gulpfile.js")
    Ant.delete(file: "${stagingDir}/jsconfig.json")
    Ant.delete(file: "${stagingDir}/karma.conf.js")
    Ant.delete(file: "${stagingDir}/package.json")
    Ant.delete(file: "${stagingDir}/protractor.conf.js")
}
