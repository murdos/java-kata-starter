# Java kata bootstrap

This is a simple java kata template.

Prerequisites:

- Java 25

## Available test frameworks

- JUnit 6
- [AssertJ](https://assertj.github.io/doc/) for fluent and natural assertions
- [Cucumber](https://cucumber.io/) for Behaviour-Driven Development (BDD)
- [JQwik](https://jqwik.net/) for Property Based Testing
- [ApprovalTests.Java](https://github.com/approvals/ApprovalTests.Java) for approval testing

## Automatic code formatting

This project setups [Prettier](https://prettier.io/) with [prettier-plugin-java](https://github.com/jhipster/prettier-java) for automatic code formatting.
This could be handy to not worry about formatting code during the kata.

If you want to format all files manually, you should install dependencies (requires Node.js):

```sh
npm ci
```

### Format on demand

```sh
npm run prettier:format
```

### Format on save in IntelliJ IDEA

1. Open **Settings** > **Languages & Frameworks** > **JavaScript** > **Prettier**
2. Choose the **Automatic Prettier configuration** option
3. Set **Run for files** to `**/*.{java,xml,json,md,feature}`
4. Check **Run on save**
