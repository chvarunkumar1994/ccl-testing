# CCL Unit
Cerner Command Language (CCL), aka Discern Explorer, is a database query and scripting language used with Cerner Millennium databases. [CCL Unit][ccl_unit] 
is a unit test framework for CCL.

***ccl-testing*** houses maven plugins to perform CCL Unit tests and analyses and generate reports from the results, to perform static analyses,
and to generate code documentation. It also houses dependencies for those maven plugins. Specifically, ccl-testing houses the components listed below. 
Please visit individual components for details and usage instructions. 

* [ccl-maven-plugin](ccl-maven-plugin/README.md) - Maven plugin for transferring resources, compiling CCL code and tests, executing the 
tests, and retrieving the test and coverage results.
* [cerreal-maven-plugin](cerreal-maven-plugin#cerreal-maven-plugin) - Maven reporting plugin to report test and coverage results.
* [whitenoise-maven-plugin](whitenoise-maven-plugin#whitenoise-maven-plugin) - Maven reporting plugin that identifies common CCL coding errors.
* [cdoc-maven-plugin](cdoc-maven-plugin#cdoc-maven-plugin) - Maven reporting plugin that generates code documentation from code comments.
* [ecosystem](ecosystem#ecosystem) - Eclipse preferences to ensure consistent formating and compiler settings. Imported using Workspace Mechanic.
* [ftp-util](ftp-util/README.md) - ccl-maven-plugin dependency used to ftp resource to/from the Cerner Millennium back end.
* [j4ccl](j4ccl#j4ccl) - ccl-maven-plugin dependency defining common classes and interfaces for accessing a Cerner Millennium back end.
* [j4ccl-ssh](j4ccl-ssh#j4ccl-ssh) - ccl-maven-plugin dependency leveraging JCraft to define ssh implemetations for j4ccl interfaces.
* [jsch-util](jsch-util#jsch-util) - ccl-maven-plugin dependency leverating JCraft to provide back-end connections for j4ccl-ssh.


Some significant differences from legacy versions to note 
* The artifactId for plugins is now `X-maven-plugin` rather than `maven-X-plugin` to satisfy [maven3 restrictions on plugin naming][plugin-naming].
* Several groupId changes. All components now live below com.cerner.ccl or com.cerner.ftp.
* The [specifyDebugCcl](ccl-maven-plugin/doc/CONFIGURATIONOPTIONS.md#specifyDebugCcl) flag in the ccl-maven-plugin.

## Quick Start Guide
If you are new to CCL Unit testing and want to get started quickly, [look here][cclunit_quickstart].

For recommendations on setting up maven, [look here](doc/CONFIGUREMAVEN.md). 

Take a look at the [sample pom configuration](ccl-maven-plugin/README.md) and 
[configuration options](ccl-maven-plugin/doc/CONFIGURATIONOPTIONS.md) for the unit testing plugin.

Don't want your password showing up in log files? [Look here](ccl-maven-plugin/doc/PASSWORDLOGGING.md).

## Release Schedule

The release schedule will be driven by requests for and contributions of enhancements and corrections.

## Contribute

You are welcomed to Contribute. Please read our [Contribution Guidelines][contibution_guidelines].



Committers should follow the [Release Guidelines][release_guidelines].


## License

```markdown
Copyright 2017 Cerner Innovation, Inc.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```


[contibution_guidelines]: CONTRIBUTING.md#contributing
[release_guidelines]: RELEASING.md#releasing-ccl-testing
[ccl_unit]: https://github.com/cerner/cclunit-framework
[cclunit_quickstart]: https://github.com/cerner/cclunit-framework/blob/master/cclunit-framework-source/doc/QUICKSTART.md
[plugin-naming]:https://maven.apache.org/guides/introduction/introduction-to-plugin-prefix-mapping.html
