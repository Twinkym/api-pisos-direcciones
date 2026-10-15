
cat > .github/PULL_REQUEST_TEMPLATE.md <<'EOF'
# Pull Request

## Description

<!-- Explain what this change does and why it is needed. -->

## Type of change

- [ ] Feature
- [ ] Bug fix
- [ ] Refactoring
- [ ] Documentation
- [ ] CI/CD
- [ ] Security

## Technical changes

<!-- List the relevant changes, components and files. -->

## Validation

- [ ] The project builds successfully.
- [ ] Tests pass.
- [ ] No unintended changes or sensitive information are included.
- [ ] Documentation has been updated where necessary.

## Database changes

- [ ] No database changes.
- [ ] Database schema or SQL scripts have changed.
- [ ] Database compatibility and migration requirements have been reviewed.

## Security considerations

<!-- Describe relevant security implications, or explain why none apply. -->

## Checklist

- [ ] Changes follow the project conventions.
- [ ] Naming and responsibilities are clear.
- [ ] The changes have been reviewed before merging.
EOF
