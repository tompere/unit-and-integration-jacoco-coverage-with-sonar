<p>This fork demonstrate the problem of jacoco-maven-sonar, when you need integration tests code coverage which extends to external modules.<br/>
In this project, you will find the test in 'itest' module, which uses inner modules 'api-one' and 'api-two', 
but jacoco's code coverage will not generate the needed result.</p>

<p>
See further discussions regarding this problem:
<ol>
<li><a href="https://github.com/jacoco/jacoco/issues/18">jacoco issue #18</a></li>
<li><a href="https://github.com/jacoco/jacoco/issues/69">jacoco issue #8</a></li>
<li><a href="https://groups.google.com/forum/#!topic/jacoco/9NNAlwuvOwk">Jacoco google groups thread</a></li>
</ol>
</p>

<hr/>

<b>forked README</b>
To generate report:
1) Download SonarQube and start it.
2) Execute (I have no idea why relative path is not working):
     mvn clean install sonar:sonar -Dsonar.jacoco.itReportPath=<absolute_path>/itest/target/jacoco-it.exec
    
