A sample project for demonstrating Google Cloud Build. 

There are two pipelines here:

1. cloudbuild-pr.yaml - this pipeline gets triggered at the point a PR is put in place. A basic test is run on the project and the PR is considered successful if the test passes.

2. cloudbuild.yaml - this pipeline gets triggered when a PR is merged to the "main" branch. The code is deployed to Google Cloud Run.

